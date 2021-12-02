package subProj_149

import subProj_149.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_149")
    name = "subProj 149"

    buildType(subProj_bt_149_0)
    buildType(subProj_bt_149_1)
    buildType(subProj_bt_149_2)
    buildType(subProj_bt_149_3)
    buildType(subProj_bt_149_4)
    buildType(subProj_bt_149_5)
})
