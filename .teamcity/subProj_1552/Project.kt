package subProj_1552

import subProj_1552.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1552")
    name = "subProj 1552"

    buildType(subProj_bt_1552_0)
    buildType(subProj_bt_1552_4)
    buildType(subProj_bt_1552_3)
    buildType(subProj_bt_1552_2)
    buildType(subProj_bt_1552_1)
    buildType(subProj_bt_1552_5)
})
