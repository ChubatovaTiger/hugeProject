package subProj_1771

import subProj_1771.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1771")
    name = "subProj 1771"

    buildType(subProj_bt_1771_0)
    buildType(subProj_bt_1771_1)
    buildType(subProj_bt_1771_2)
    buildType(subProj_bt_1771_3)
    buildType(subProj_bt_1771_4)
    buildType(subProj_bt_1771_5)
})
