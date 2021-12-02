package subProj_771

import subProj_771.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_771")
    name = "subProj 771"

    buildType(subProj_bt_771_0)
    buildType(subProj_bt_771_2)
    buildType(subProj_bt_771_1)
    buildType(subProj_bt_771_4)
    buildType(subProj_bt_771_3)
    buildType(subProj_bt_771_5)
})
