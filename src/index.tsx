import { NativeModules } from 'react-native';

type CalendarType = {
  multiply(a: number, b: number): Promise<number>;
};

const { Calendar } = NativeModules;

export default Calendar as CalendarType;
