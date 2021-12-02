package subProj_1992

import subProj_1992.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1992")
    name = "subProj 1992"

    buildType(subProj_bt_1992_5)
    buildType(subProj_bt_1992_2)
    buildType(subProj_bt_1992_1)
    buildType(subProj_bt_1992_4)
    buildType(subProj_bt_1992_3)
    buildType(subProj_bt_1992_0)
})
