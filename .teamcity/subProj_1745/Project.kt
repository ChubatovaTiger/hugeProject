package subProj_1745

import subProj_1745.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1745")
    name = "subProj 1745"

    buildType(subProj_bt_1745_2)
    buildType(subProj_bt_1745_1)
    buildType(subProj_bt_1745_0)
    buildType(subProj_bt_1745_5)
    buildType(subProj_bt_1745_4)
    buildType(subProj_bt_1745_3)
})
