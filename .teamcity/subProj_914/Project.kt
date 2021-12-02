package subProj_914

import subProj_914.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_914")
    name = "subProj 914"

    buildType(subProj_bt_914_5)
    buildType(subProj_bt_914_4)
    buildType(subProj_bt_914_3)
    buildType(subProj_bt_914_2)
    buildType(subProj_bt_914_1)
    buildType(subProj_bt_914_0)
})
