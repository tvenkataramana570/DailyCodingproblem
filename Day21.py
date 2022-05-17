'''

Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.

For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.

'''
def solution(n):
     time_counter = [0 for i in range(1441)]
     for i in n:
         time_counter[i[0]] += 1
         time_counter[i[1]] += -1
     rooms, tmp = 0, 0
     print(time_counter)
     for i in time_counter:
         tmp += i
         if(tmp > rooms):
             rooms = tmp
     return rooms
print(solution([[30, 75], [0, 50], [60, 150]]))
