package subProj_1043

import subProj_1043.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1043")
    name = "subProj 1043"

    buildType(subProj_bt_1043_4)
    buildType(subProj_bt_1043_5)
    buildType(subProj_bt_1043_0)
    buildType(subProj_bt_1043_1)
    buildType(subProj_bt_1043_2)
    buildType(subProj_bt_1043_3)
})
