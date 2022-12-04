public final class InputDay4 {

    public static final String SMALL_INPUT = "2-4,6-8\n" +
            "2-3,4-5\n" +
            "5-7,7-9\n" +
            "2-8,3-7\n" +
            "6-6,4-6\n" +
            "2-6,4-8";
    public static final String LARGE_INPUT = "4-90,1-4\n" +
            "80-94,80-81\n" +
            "1-97,96-99\n" +
            "20-87,20-88\n" +
            "84-84,83-88\n" +
            "9-75,10-75\n" +
            "7-25,24-48\n" +
            "10-99,11-98\n" +
            "4-98,1-1\n" +
            "20-42,1-42\n" +
            "5-31,6-31\n" +
            "9-14,15-84\n" +
            "87-98,22-81\n" +
            "44-69,45-68\n" +
            "2-2,2-83\n" +
            "16-76,69-75\n" +
            "43-71,43-91\n" +
            "30-95,29-29\n" +
            "1-1,3-87\n" +
            "22-90,22-80\n" +
            "86-90,91-98\n" +
            "11-20,10-20\n" +
            "59-67,60-79\n" +
            "20-75,20-95\n" +
            "26-57,27-56\n" +
            "7-71,6-72\n" +
            "10-78,1-6\n" +
            "59-67,31-68\n" +
            "91-95,7-81\n" +
            "15-60,14-14\n" +
            "5-54,6-53\n" +
            "88-97,91-96\n" +
            "46-70,45-69\n" +
            "65-79,64-86\n" +
            "74-74,25-73\n" +
            "1-95,95-98\n" +
            "8-70,70-71\n" +
            "1-2,1-1\n" +
            "35-43,38-60\n" +
            "11-81,12-12\n" +
            "1-1,1-90\n" +
            "5-10,4-23\n" +
            "87-97,52-96\n" +
            "4-98,5-98\n" +
            "1-3,7-90\n" +
            "91-93,10-92\n" +
            "46-46,46-89\n" +
            "10-99,10-97\n" +
            "34-50,51-51\n" +
            "26-72,42-73\n" +
            "9-69,9-10\n" +
            "78-85,22-79\n" +
            "65-72,64-78\n" +
            "52-93,51-52\n" +
            "4-22,5-22\n" +
            "33-34,11-55\n" +
            "46-91,47-90\n" +
            "78-96,12-96\n" +
            "16-98,15-98\n" +
            "28-78,6-77\n" +
            "7-15,7-16\n" +
            "35-95,13-43\n" +
            "99-99,73-92\n" +
            "34-70,38-69\n" +
            "4-74,92-96\n" +
            "86-90,52-90\n" +
            "15-45,15-44\n" +
            "11-53,54-86\n" +
            "21-78,16-21\n" +
            "30-35,32-34\n" +
            "49-72,71-78\n" +
            "77-94,35-63\n" +
            "6-47,17-36\n" +
            "7-96,6-94\n" +
            "50-51,50-65\n" +
            "15-75,14-76\n" +
            "19-88,12-87\n" +
            "13-64,4-63\n" +
            "53-64,52-65\n" +
            "69-79,79-86\n" +
            "13-34,13-14\n" +
            "48-57,48-85\n" +
            "66-80,2-79\n" +
            "11-82,3-6\n" +
            "29-91,29-84\n" +
            "7-16,16-36\n" +
            "45-86,44-87\n" +
            "86-86,21-86\n" +
            "21-87,22-86\n" +
            "6-79,12-79\n" +
            "3-64,98-98\n" +
            "44-69,45-68\n" +
            "19-94,95-95\n" +
            "5-92,5-84\n" +
            "83-85,84-85\n" +
            "16-88,16-89\n" +
            "86-91,29-86\n" +
            "27-85,86-86\n" +
            "48-60,48-69\n" +
            "1-3,3-82\n" +
            "25-25,40-46\n" +
            "52-77,51-76\n" +
            "35-38,36-38\n" +
            "75-75,5-76\n" +
            "62-77,63-69\n" +
            "21-83,22-91\n" +
            "12-12,12-93\n" +
            "30-82,31-41\n" +
            "17-62,18-63\n" +
            "5-97,3-5\n" +
            "49-96,50-96\n" +
            "46-48,46-50\n" +
            "22-22,14-21\n" +
            "5-98,4-98\n" +
            "91-92,16-92\n" +
            "1-97,98-99\n" +
            "85-97,73-96\n" +
            "45-62,11-50\n" +
            "3-14,13-73\n" +
            "8-75,9-76\n" +
            "32-58,33-53\n" +
            "3-68,65-68\n" +
            "6-10,6-7\n" +
            "2-2,2-26\n" +
            "6-96,5-95\n" +
            "12-90,53-90\n" +
            "48-86,49-59\n" +
            "4-89,4-95\n" +
            "44-44,45-54\n" +
            "43-65,42-89\n" +
            "95-95,5-79\n" +
            "51-53,37-52\n" +
            "31-99,30-97\n" +
            "3-83,2-78\n" +
            "32-73,32-33\n" +
            "68-83,68-79\n" +
            "4-17,16-53\n" +
            "25-64,24-26\n" +
            "8-92,8-93\n" +
            "3-77,3-78\n" +
            "53-77,29-77\n" +
            "77-99,76-97\n" +
            "46-88,49-83\n" +
            "52-63,53-64\n" +
            "25-78,14-84\n" +
            "5-39,4-39\n" +
            "48-84,49-83\n" +
            "14-78,52-83\n" +
            "27-87,35-95\n" +
            "11-48,6-48\n" +
            "3-99,1-34\n" +
            "20-25,28-67\n" +
            "33-61,34-83\n" +
            "11-21,20-32\n" +
            "30-39,10-39\n" +
            "22-25,29-51\n" +
            "18-88,32-89\n" +
            "12-87,12-13\n" +
            "49-76,29-32\n" +
            "17-52,77-92\n" +
            "72-79,65-79\n" +
            "4-53,2-2\n" +
            "61-91,62-91\n" +
            "6-69,70-70\n" +
            "2-96,96-99\n" +
            "20-68,19-68\n" +
            "60-98,59-59\n" +
            "31-34,30-34\n" +
            "2-22,19-21\n" +
            "3-80,79-80\n" +
            "72-72,71-71\n" +
            "1-92,1-1\n" +
            "67-86,48-94\n" +
            "42-43,43-80\n" +
            "3-89,89-90\n" +
            "5-68,3-69\n" +
            "7-7,6-65\n" +
            "78-86,78-81\n" +
            "54-85,85-85\n" +
            "9-64,10-10\n" +
            "39-96,38-38\n" +
            "60-62,18-61\n" +
            "20-47,47-81\n" +
            "2-97,98-99\n" +
            "18-83,83-83\n" +
            "12-93,12-13\n" +
            "4-4,3-74\n" +
            "77-96,11-62\n" +
            "2-81,2-80\n" +
            "53-59,52-59\n" +
            "55-94,54-90\n" +
            "29-30,29-42\n" +
            "52-69,64-69\n" +
            "9-90,3-10\n" +
            "16-39,15-61\n" +
            "74-76,38-75\n" +
            "12-14,22-43\n" +
            "12-90,11-11\n" +
            "5-94,6-93\n" +
            "6-18,17-23\n" +
            "8-8,8-18\n" +
            "27-42,26-41\n" +
            "8-77,7-7\n" +
            "46-47,47-47\n" +
            "1-57,21-29\n" +
            "11-87,2-2\n" +
            "45-45,46-46\n" +
            "64-65,64-87\n" +
            "36-36,37-74\n" +
            "34-56,38-56\n" +
            "66-77,67-98\n" +
            "1-86,2-21\n" +
            "11-30,12-29\n" +
            "98-99,31-97\n" +
            "5-5,10-71\n" +
            "18-83,11-19\n" +
            "8-38,3-8\n" +
            "2-79,48-78\n" +
            "10-14,9-24\n" +
            "16-91,16-96\n" +
            "3-3,4-99\n" +
            "25-35,29-84\n" +
            "49-70,50-74\n" +
            "48-68,49-49\n" +
            "61-61,57-61\n" +
            "40-79,50-78\n" +
            "56-83,27-84\n" +
            "82-92,54-82\n" +
            "50-59,59-69\n" +
            "52-84,52-83\n" +
            "17-66,15-65\n" +
            "2-91,3-3\n" +
            "13-47,12-88\n" +
            "62-80,61-70\n" +
            "11-71,4-8\n" +
            "35-88,36-88\n" +
            "9-55,5-10\n" +
            "31-53,30-91\n" +
            "22-36,35-97\n" +
            "5-64,4-65\n" +
            "61-61,4-62\n" +
            "10-78,16-73\n" +
            "6-81,5-82\n" +
            "10-42,9-75\n" +
            "17-36,16-96\n" +
            "51-83,85-85\n" +
            "35-68,67-68\n" +
            "46-61,19-60\n" +
            "12-55,10-56\n" +
            "3-90,9-91\n" +
            "63-97,98-99\n" +
            "32-93,33-52\n" +
            "66-71,67-67\n" +
            "22-82,82-83\n" +
            "6-91,7-92\n" +
            "76-97,98-99\n" +
            "33-86,53-85\n" +
            "37-83,37-82\n" +
            "5-86,64-87\n" +
            "29-52,40-51\n" +
            "60-76,76-77\n" +
            "20-40,56-58\n" +
            "14-88,3-89\n" +
            "15-15,16-88\n" +
            "96-99,6-97\n" +
            "55-76,54-76\n" +
            "22-88,28-81\n" +
            "21-21,21-36\n" +
            "2-92,1-93\n" +
            "13-36,12-35\n" +
            "50-81,18-51\n" +
            "46-48,1-47\n" +
            "17-82,82-84\n" +
            "7-9,12-88\n" +
            "16-94,16-58\n" +
            "18-52,17-96\n" +
            "6-82,7-82\n" +
            "14-94,48-93\n" +
            "12-76,9-13\n" +
            "20-98,21-96\n" +
            "69-95,16-92\n" +
            "2-3,2-93\n" +
            "28-38,27-39\n" +
            "11-65,11-64\n" +
            "43-44,43-63\n" +
            "1-1,4-98\n" +
            "3-3,3-9\n" +
            "63-89,21-63\n" +
            "6-48,5-48\n" +
            "13-51,13-50\n" +
            "90-96,53-95\n" +
            "9-44,30-44\n" +
            "61-74,61-62\n" +
            "47-87,48-83\n" +
            "26-26,25-96\n" +
            "58-95,57-95\n" +
            "24-81,80-81\n" +
            "9-95,3-94\n" +
            "13-31,14-32\n" +
            "14-89,89-89\n" +
            "19-29,18-28\n" +
            "7-41,4-7\n" +
            "63-73,63-64\n" +
            "3-11,10-95\n" +
            "36-41,26-47\n" +
            "19-79,18-80\n" +
            "46-86,30-45\n" +
            "84-91,84-87\n" +
            "1-76,1-88\n" +
            "43-80,1-3\n" +
            "3-8,47-77\n" +
            "54-54,21-55\n" +
            "3-83,82-83\n" +
            "54-72,15-55\n" +
            "10-49,62-71\n" +
            "7-98,10-93\n" +
            "89-92,8-93\n" +
            "67-68,24-67\n" +
            "43-80,44-84\n" +
            "35-51,88-99\n" +
            "4-99,3-98\n" +
            "16-63,8-64\n" +
            "80-99,81-99\n" +
            "14-95,13-96\n" +
            "13-84,12-13\n" +
            "19-80,18-81\n" +
            "2-91,3-86\n" +
            "59-59,1-58\n" +
            "23-90,10-21\n" +
            "99-99,3-96\n" +
            "7-7,3-8\n" +
            "66-95,24-95\n" +
            "27-86,26-86\n" +
            "45-96,48-95\n" +
            "33-56,29-34\n" +
            "43-43,44-91\n" +
            "2-96,3-97\n" +
            "16-16,15-77\n" +
            "61-61,61-71\n" +
            "17-73,73-74\n" +
            "64-86,63-86\n" +
            "21-23,42-46\n" +
            "29-30,19-30\n" +
            "12-96,2-97\n" +
            "25-25,25-73\n" +
            "15-21,14-20\n" +
            "82-90,15-69\n" +
            "5-29,6-29\n" +
            "2-95,82-96\n" +
            "19-56,6-55\n" +
            "24-56,24-52\n" +
            "5-6,5-94\n" +
            "40-97,40-40\n" +
            "79-99,55-80\n" +
            "9-98,97-99\n" +
            "16-98,9-99\n" +
            "70-71,24-70\n" +
            "13-34,14-33\n" +
            "40-41,40-51\n" +
            "6-98,7-97\n" +
            "16-77,55-58\n" +
            "16-24,9-19\n" +
            "41-70,42-70\n" +
            "6-98,99-99\n" +
            "77-77,40-76\n" +
            "34-77,34-87\n" +
            "74-92,29-74\n" +
            "5-33,4-96\n" +
            "14-83,1-82\n" +
            "5-40,5-30\n" +
            "72-72,11-71\n" +
            "45-45,44-58\n" +
            "10-10,9-72\n" +
            "5-42,1-43\n" +
            "11-99,10-99\n" +
            "6-6,6-96\n" +
            "39-59,38-60\n" +
            "92-94,41-93\n" +
            "1-17,3-94\n" +
            "20-49,20-50\n" +
            "3-26,28-54\n" +
            "40-60,10-59\n" +
            "24-95,55-96\n" +
            "4-97,5-98\n" +
            "3-93,1-93\n" +
            "3-99,4-95\n" +
            "60-98,17-57\n" +
            "12-12,13-78\n" +
            "3-34,2-99\n" +
            "6-6,5-63\n" +
            "3-85,4-65\n" +
            "4-77,4-77\n" +
            "56-56,11-55\n" +
            "27-99,37-98\n" +
            "7-7,7-59\n" +
            "22-89,28-85\n" +
            "6-39,7-96\n" +
            "15-21,11-16\n" +
            "51-72,13-71\n" +
            "7-41,7-41\n" +
            "18-28,10-27\n" +
            "38-78,25-38\n" +
            "32-84,32-83\n" +
            "48-92,48-69\n" +
            "83-84,84-84\n" +
            "52-94,52-89\n" +
            "33-33,31-33\n" +
            "34-78,34-35\n" +
            "6-97,14-96\n" +
            "18-62,17-70\n" +
            "12-51,13-56\n" +
            "68-68,24-67\n" +
            "6-19,19-63\n" +
            "19-88,15-88\n" +
            "44-62,45-63\n" +
            "5-82,6-82\n" +
            "4-89,96-99\n" +
            "20-35,35-85\n" +
            "39-52,38-51\n" +
            "44-98,28-99\n" +
            "76-78,6-76\n" +
            "86-93,37-88\n" +
            "63-82,12-83\n" +
            "69-78,61-79\n" +
            "97-98,6-98\n" +
            "28-73,28-28\n" +
            "11-73,10-73\n" +
            "3-4,6-80\n" +
            "71-75,72-75\n" +
            "74-75,10-74\n" +
            "5-99,4-18\n" +
            "24-32,9-25\n" +
            "1-8,7-80\n" +
            "17-53,52-93\n" +
            "13-95,12-94\n" +
            "28-87,28-54\n" +
            "78-89,90-93\n" +
            "24-54,54-54\n" +
            "11-62,10-62\n" +
            "66-82,65-82\n" +
            "31-94,30-94\n" +
            "5-96,6-98\n" +
            "90-91,27-81\n" +
            "63-64,63-89\n" +
            "5-63,5-5\n" +
            "91-92,3-41\n" +
            "65-66,60-65\n" +
            "48-99,48-49\n" +
            "9-96,8-9\n" +
            "6-48,6-47\n" +
            "4-87,3-86\n" +
            "10-99,11-98\n" +
            "4-79,4-4\n" +
            "19-71,65-72\n" +
            "3-90,3-3\n" +
            "16-97,17-98\n" +
            "61-98,99-99\n" +
            "7-24,6-66\n" +
            "76-82,77-82\n" +
            "47-89,46-94\n" +
            "4-91,6-70\n" +
            "28-29,30-53\n" +
            "54-58,55-74\n" +
            "33-71,72-99\n" +
            "26-26,26-43\n" +
            "97-99,12-94\n" +
            "30-82,99-99\n" +
            "94-94,42-94\n" +
            "4-98,5-98\n" +
            "41-82,40-83\n" +
            "1-92,97-99\n" +
            "40-43,31-39\n" +
            "60-96,59-68\n" +
            "90-90,90-95\n" +
            "22-24,22-97\n" +
            "13-98,98-99\n" +
            "56-86,85-85\n" +
            "89-92,93-93\n" +
            "80-80,4-81\n" +
            "67-98,66-87\n" +
            "5-97,6-97\n" +
            "20-67,68-68\n" +
            "6-18,4-6\n" +
            "31-71,32-32\n" +
            "14-25,13-39\n" +
            "90-90,9-91\n" +
            "4-80,51-79\n" +
            "59-88,15-99\n" +
            "27-76,28-28\n" +
            "7-47,48-48\n" +
            "15-94,16-89\n" +
            "15-50,16-50\n" +
            "31-56,2-32\n" +
            "14-62,15-61\n" +
            "9-99,9-97\n" +
            "82-92,11-82\n" +
            "3-33,3-32\n" +
            "9-79,51-78\n" +
            "63-80,36-63\n" +
            "57-60,57-82\n" +
            "51-53,52-89\n" +
            "11-20,44-98\n" +
            "41-79,36-41\n" +
            "61-79,74-79\n" +
            "20-55,54-70\n" +
            "49-51,17-50\n" +
            "15-20,15-19\n" +
            "46-75,47-74\n" +
            "38-65,34-39\n" +
            "86-89,37-85\n" +
            "4-85,3-3\n" +
            "8-76,2-76\n" +
            "62-73,45-73\n" +
            "29-31,29-53\n" +
            "76-78,25-77\n" +
            "11-98,11-11\n" +
            "17-93,18-94\n" +
            "4-12,5-12\n" +
            "15-75,18-76\n" +
            "1-14,1-3\n" +
            "35-98,34-99\n" +
            "2-34,34-67\n" +
            "18-23,18-68\n" +
            "68-70,39-69\n" +
            "64-86,85-87\n" +
            "22-94,5-64\n" +
            "12-95,13-95\n" +
            "88-88,68-87\n" +
            "15-82,30-50\n" +
            "11-26,25-27\n" +
            "12-12,11-53\n" +
            "15-47,48-48\n" +
            "56-63,62-83\n" +
            "36-98,35-98\n" +
            "29-46,30-47\n" +
            "64-64,50-64\n" +
            "4-67,9-67\n" +
            "71-95,67-94\n" +
            "58-66,57-63\n" +
            "55-71,56-70\n" +
            "7-10,7-11\n" +
            "17-91,90-90\n" +
            "81-81,41-81\n" +
            "1-24,1-5\n" +
            "69-98,98-98\n" +
            "15-85,14-85\n" +
            "75-95,33-51\n" +
            "13-67,17-66\n" +
            "22-46,23-63\n" +
            "3-94,3-4\n" +
            "11-81,81-83\n" +
            "79-92,80-80\n" +
            "5-79,5-80\n" +
            "67-75,66-96\n" +
            "51-75,76-76\n" +
            "12-74,13-73\n" +
            "4-11,10-65\n" +
            "17-61,8-11\n" +
            "63-63,9-64\n" +
            "38-38,23-38\n" +
            "15-89,19-80\n" +
            "95-96,74-95\n" +
            "79-81,63-80\n" +
            "89-89,39-88\n" +
            "7-41,8-41\n" +
            "16-23,22-96\n" +
            "7-50,8-98\n" +
            "30-75,31-74\n" +
            "30-30,30-89\n" +
            "52-53,52-78\n" +
            "15-16,21-40\n" +
            "3-37,13-38\n" +
            "18-61,19-32\n" +
            "78-79,1-78\n" +
            "40-65,66-98\n" +
            "2-72,67-71\n" +
            "7-9,8-88\n" +
            "26-61,25-25\n" +
            "49-91,49-92\n" +
            "2-24,2-94\n" +
            "10-43,10-44\n" +
            "73-80,6-79\n" +
            "65-66,66-66\n" +
            "24-31,31-32\n" +
            "4-23,40-58\n" +
            "4-86,1-1\n" +
            "1-93,1-1\n" +
            "7-8,7-83\n" +
            "53-53,35-52\n" +
            "7-7,6-71\n" +
            "8-77,76-77\n" +
            "11-33,11-42\n" +
            "66-66,67-67\n" +
            "35-53,34-52\n" +
            "23-23,23-68\n" +
            "9-20,10-15\n" +
            "16-74,15-83\n" +
            "20-82,58-81\n" +
            "19-84,82-84\n" +
            "50-77,50-77\n" +
            "5-7,7-71\n" +
            "18-93,52-92\n" +
            "77-93,89-99\n" +
            "43-43,42-43\n" +
            "4-64,1-83\n" +
            "8-74,74-75\n" +
            "29-62,29-94\n" +
            "8-50,1-9\n" +
            "9-99,8-61\n" +
            "5-98,4-98\n" +
            "17-79,79-80\n" +
            "53-84,54-85\n" +
            "36-78,37-79\n" +
            "45-74,46-73\n" +
            "43-64,44-65\n" +
            "39-45,38-72\n" +
            "13-32,12-96\n" +
            "5-5,5-84\n" +
            "66-96,67-81\n" +
            "84-84,24-83\n" +
            "27-66,65-67\n" +
            "12-46,64-72\n" +
            "34-94,95-95\n" +
            "10-89,10-11\n" +
            "4-72,3-71\n" +
            "13-38,12-16\n" +
            "15-92,92-93\n" +
            "16-16,17-74\n" +
            "89-89,88-88\n" +
            "5-65,6-65\n" +
            "63-87,64-86\n" +
            "19-86,18-86\n" +
            "72-72,51-73\n" +
            "64-95,65-65\n" +
            "15-92,15-16\n" +
            "48-86,49-86\n" +
            "96-98,2-97\n" +
            "99-99,2-97\n" +
            "52-61,51-51\n" +
            "80-92,13-93\n" +
            "95-97,89-96\n" +
            "49-54,54-59\n" +
            "63-99,62-89\n" +
            "4-88,3-88\n" +
            "8-56,8-56\n" +
            "10-31,30-32\n" +
            "44-44,26-43\n" +
            "81-93,40-91\n" +
            "34-60,60-61\n" +
            "22-80,12-23\n" +
            "46-84,78-85\n" +
            "22-83,22-71\n" +
            "16-98,19-94\n" +
            "34-47,39-46\n" +
            "1-12,73-81\n" +
            "12-98,12-48\n" +
            "13-91,21-59\n" +
            "26-65,26-66\n" +
            "33-33,33-55\n" +
            "6-99,7-98\n" +
            "12-12,12-67\n" +
            "11-68,1-95\n" +
            "82-94,6-83\n" +
            "62-70,61-94\n" +
            "9-9,10-76\n" +
            "23-93,93-93\n" +
            "65-87,64-87\n" +
            "86-88,19-87\n" +
            "91-92,3-96\n" +
            "8-93,93-94\n" +
            "4-29,4-18\n" +
            "10-23,22-35\n" +
            "7-18,18-56\n" +
            "23-82,7-11\n" +
            "60-75,39-49\n" +
            "9-78,19-77\n" +
            "42-86,41-41\n" +
            "24-24,39-99\n" +
            "92-92,4-91\n" +
            "3-12,4-14\n" +
            "17-65,29-66\n" +
            "44-91,92-93\n" +
            "3-96,2-97\n" +
            "5-92,4-93\n" +
            "74-76,36-75\n" +
            "8-65,6-9\n" +
            "11-84,78-85\n" +
            "50-50,30-57\n" +
            "5-77,1-2\n" +
            "31-94,93-95\n" +
            "40-71,41-70\n" +
            "90-92,4-91\n" +
            "9-66,80-87\n" +
            "30-57,57-86\n" +
            "26-34,27-34\n" +
            "38-84,37-85\n" +
            "65-74,65-66\n" +
            "60-84,3-85\n" +
            "4-63,3-93\n" +
            "61-93,62-62\n" +
            "18-24,18-19\n" +
            "7-12,11-13\n" +
            "60-70,60-61\n" +
            "4-57,4-63\n" +
            "21-30,29-62\n" +
            "49-89,48-90\n" +
            "9-97,96-98\n" +
            "1-97,3-94\n" +
            "4-93,4-94\n" +
            "3-96,7-81\n" +
            "2-2,2-86\n" +
            "4-8,1-8\n" +
            "28-33,53-82\n" +
            "20-91,19-91\n" +
            "1-88,20-76\n" +
            "8-70,3-16\n" +
            "13-63,63-71\n" +
            "4-71,71-72\n" +
            "14-88,89-89\n" +
            "8-87,5-9\n" +
            "6-63,47-62\n" +
            "61-99,61-99\n" +
            "22-26,21-84\n" +
            "47-86,47-51\n" +
            "9-15,4-14\n" +
            "2-67,3-66\n" +
            "22-94,23-94\n" +
            "21-86,20-86\n" +
            "24-68,24-64\n" +
            "38-38,38-56\n" +
            "43-99,33-44\n" +
            "85-86,53-85\n" +
            "69-69,12-69\n" +
            "11-12,30-98\n" +
            "28-58,25-28\n" +
            "27-94,28-98\n" +
            "7-94,99-99\n" +
            "35-91,17-92\n" +
            "92-92,19-91\n" +
            "12-94,40-93\n" +
            "18-82,18-19\n" +
            "3-96,2-97\n" +
            "43-71,44-70\n" +
            "39-82,40-83\n" +
            "6-52,24-52\n" +
            "19-51,20-52\n" +
            "26-53,48-54\n" +
            "15-99,14-16\n" +
            "5-12,11-97\n" +
            "12-86,86-87\n" +
            "27-27,26-94\n" +
            "14-15,18-87\n" +
            "20-46,37-90\n" +
            "12-61,12-13\n" +
            "25-25,19-25\n" +
            "93-97,13-92\n" +
            "1-10,10-11\n" +
            "25-34,25-30\n" +
            "53-59,54-59\n" +
            "25-92,66-93\n" +
            "6-6,5-40\n" +
            "2-31,1-32\n" +
            "5-5,6-76\n" +
            "19-99,9-98\n" +
            "12-92,11-91\n" +
            "3-33,58-90\n" +
            "19-64,33-63\n" +
            "10-54,10-55\n" +
            "8-8,9-90\n" +
            "16-90,15-90\n" +
            "82-94,82-83\n" +
            "12-77,27-64\n" +
            "14-37,15-36\n" +
            "63-83,74-84\n" +
            "7-98,7-93\n" +
            "7-87,23-88\n" +
            "9-95,4-9\n" +
            "42-46,80-89\n" +
            "7-92,8-91\n" +
            "7-14,7-20\n" +
            "43-91,42-42\n" +
            "53-81,1-82\n" +
            "8-80,6-20\n" +
            "19-59,5-58\n" +
            "29-90,13-29\n" +
            "29-90,28-30\n" +
            "89-95,18-96\n" +
            "76-76,21-75\n" +
            "28-97,27-97\n" +
            "28-91,27-91\n" +
            "5-89,12-85\n" +
            "62-63,20-62\n" +
            "33-90,33-98\n" +
            "12-53,11-54\n" +
            "31-66,67-67\n" +
            "60-90,61-91\n" +
            "8-8,10-83\n" +
            "50-82,36-83\n" +
            "54-95,55-96\n" +
            "42-80,43-81\n" +
            "40-40,40-75\n" +
            "10-69,9-27\n" +
            "43-47,26-34\n" +
            "44-75,12-76\n" +
            "35-36,35-97\n" +
            "6-25,5-25\n" +
            "4-65,2-5\n" +
            "70-71,50-70\n" +
            "9-95,4-9\n" +
            "38-75,38-39\n" +
            "72-94,8-71\n" +
            "30-97,30-31\n" +
            "8-87,8-40\n" +
            "19-59,18-59\n" +
            "3-96,1-96\n" +
            "4-69,3-99\n" +
            "4-7,7-98\n" +
            "16-94,93-94\n" +
            "8-86,9-87\n" +
            "23-97,23-98\n" +
            "5-89,6-6\n" +
            "15-32,15-15\n" +
            "8-79,2-8\n" +
            "6-22,7-22\n" +
            "89-91,24-90\n" +
            "57-85,7-86\n" +
            "54-79,53-54\n" +
            "96-97,7-97\n" +
            "45-45,9-44\n" +
            "28-98,46-97\n" +
            "40-65,66-66\n" +
            "12-26,13-26\n" +
            "10-10,10-76\n" +
            "29-59,28-59\n" +
            "17-39,16-72\n" +
            "69-70,70-81\n" +
            "60-61,60-64\n" +
            "18-56,18-95\n" +
            "21-21,21-80\n" +
            "15-36,15-95\n" +
            "1-98,1-1\n" +
            "61-65,60-66\n" +
            "80-91,80-99\n" +
            "42-81,65-82\n" +
            "44-87,43-90\n" +
            "12-90,11-90\n" +
            "5-94,6-94\n" +
            "81-81,44-80\n" +
            "2-37,21-47\n" +
            "26-81,30-81\n" +
            "29-81,97-97\n" +
            "7-79,3-78\n" +
            "43-74,42-73\n" +
            "3-77,3-74\n" +
            "2-74,1-2\n" +
            "46-68,14-46\n" +
            "1-58,3-78\n" +
            "46-70,13-52\n" +
            "92-96,32-92\n" +
            "32-81,31-80\n" +
            "17-97,17-98\n" +
            "40-75,75-76\n" +
            "22-22,22-73\n" +
            "13-96,13-95\n" +
            "47-70,46-70\n" +
            "21-56,22-22\n" +
            "7-87,3-96\n" +
            "12-48,13-48\n" +
            "23-84,3-24\n" +
            "20-98,20-99\n" +
            "8-79,6-95\n" +
            "6-62,2-98\n" +
            "21-28,3-28\n" +
            "67-69,59-68\n" +
            "16-86,14-14\n" +
            "25-77,25-26\n" +
            "9-34,9-35\n" +
            "8-13,14-14\n" +
            "8-24,8-91\n" +
            "8-76,6-75\n" +
            "9-78,9-10\n" +
            "19-82,7-19\n" +
            "83-84,62-83\n" +
            "16-86,17-86\n" +
            "32-32,14-31\n" +
            "24-73,23-99\n" +
            "5-16,5-15\n" +
            "7-99,8-98\n" +
            "12-94,13-91\n" +
            "37-38,37-92\n" +
            "3-87,3-4\n" +
            "10-96,10-93\n" +
            "2-77,1-76\n" +
            "61-87,37-70\n" +
            "2-24,80-86\n" +
            "3-97,3-17\n" +
            "5-74,46-58\n" +
            "76-78,40-77\n" +
            "7-94,7-87\n" +
            "15-31,31-32\n" +
            "10-96,70-98\n" +
            "4-51,52-90\n" +
            "48-52,52-75\n" +
            "19-46,18-47\n" +
            "82-97,25-96\n" +
            "15-54,8-15\n" +
            "90-90,89-94\n" +
            "16-91,16-65\n" +
            "3-97,3-99\n" +
            "6-90,6-91\n" +
            "75-76,1-75\n" +
            "9-9,8-86\n" +
            "34-34,34-36\n" +
            "94-94,42-93\n" +
            "7-37,6-36\n" +
            "5-5,5-67\n" +
            "59-84,3-90\n" +
            "26-26,25-99\n" +
            "44-97,96-97\n" +
            "41-77,42-57\n" +
            "33-79,34-80\n" +
            "68-70,68-68\n" +
            "68-81,67-80\n" +
            "4-93,4-5\n" +
            "25-42,3-26\n" +
            "44-77,45-95\n" +
            "38-97,96-98\n" +
            "33-34,32-34\n" +
            "90-93,89-89\n" +
            "21-60,60-85\n" +
            "44-91,20-95\n" +
            "26-68,25-63\n" +
            "17-18,17-73\n" +
            "6-93,6-7\n" +
            "26-31,27-32\n" +
            "10-97,10-98\n" +
            "33-84,33-92\n" +
            "93-98,2-93\n" +
            "39-92,39-91\n" +
            "9-73,8-65\n" +
            "10-89,9-62\n" +
            "50-89,50-51\n" +
            "35-98,99-99\n" +
            "50-96,24-87\n" +
            "99-99,25-96\n" +
            "37-78,4-79\n" +
            "2-10,10-11\n" +
            "13-71,11-14\n" +
            "51-76,7-76\n" +
            "38-52,42-51\n" +
            "10-91,3-11\n" +
            "7-78,3-79\n" +
            "5-7,3-3\n" +
            "28-50,17-50\n" +
            "39-62,4-15\n" +
            "6-97,5-98\n" +
            "63-91,23-99\n" +
            "12-93,11-19\n" +
            "52-93,73-99\n" +
            "12-95,12-12\n" +
            "13-28,27-84\n" +
            "83-85,12-84\n" +
            "26-99,26-27\n" +
            "58-62,57-88\n" +
            "27-43,44-44\n" +
            "43-96,20-44\n" +
            "34-61,59-60\n" +
            "44-75,43-75\n" +
            "1-99,5-93\n" +
            "17-99,18-98\n" +
            "84-90,85-89\n" +
            "5-49,1-5\n" +
            "26-74,43-74\n" +
            "65-93,65-90\n" +
            "18-84,11-19\n" +
            "15-15,14-83\n" +
            "19-97,19-96\n" +
            "2-95,4-95\n" +
            "84-84,85-85\n" +
            "7-53,53-56\n" +
            "2-2,3-60\n" +
            "24-48,48-72\n" +
            "1-1,1-97\n" +
            "15-29,16-20\n" +
            "1-20,19-50\n" +
            "6-88,1-7\n" +
            "14-47,13-13\n" +
            "4-44,4-42\n" +
            "7-98,7-12\n" +
            "30-69,3-30\n" +
            "73-82,81-83\n" +
            "1-96,1-86\n" +
            "4-4,3-48\n" +
            "94-96,5-86\n" +
            "29-73,29-30\n" +
            "21-22,22-80\n" +
            "97-98,29-98\n" +
            "42-75,76-84\n" +
            "86-92,85-93\n" +
            "14-70,13-69";
}
