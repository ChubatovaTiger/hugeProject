package subProj_1777

import subProj_1777.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1777")
    name = "subProj 1777"

    buildType(subProj_bt_1777_4)
    buildType(subProj_bt_1777_5)
    buildType(subProj_bt_1777_0)
    buildType(subProj_bt_1777_1)
    buildType(subProj_bt_1777_2)
    buildType(subProj_bt_1777_3)
})
