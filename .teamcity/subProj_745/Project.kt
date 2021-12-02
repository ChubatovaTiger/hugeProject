package subProj_745

import subProj_745.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_745")
    name = "subProj 745"

    buildType(subProj_bt_745_4)
    buildType(subProj_bt_745_5)
    buildType(subProj_bt_745_0)
    buildType(subProj_bt_745_1)
    buildType(subProj_bt_745_2)
    buildType(subProj_bt_745_3)
})
