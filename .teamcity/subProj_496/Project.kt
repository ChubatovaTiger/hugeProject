package subProj_496

import subProj_496.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_496")
    name = "subProj 496"

    buildType(subProj_bt_496_3)
    buildType(subProj_bt_496_4)
    buildType(subProj_bt_496_5)
    buildType(subProj_bt_496_0)
    buildType(subProj_bt_496_1)
    buildType(subProj_bt_496_2)
})
