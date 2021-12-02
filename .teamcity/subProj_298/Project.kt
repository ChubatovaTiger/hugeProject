package subProj_298

import subProj_298.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_298")
    name = "subProj 298"

    buildType(subProj_bt_298_0)
    buildType(subProj_bt_298_1)
    buildType(subProj_bt_298_2)
    buildType(subProj_bt_298_3)
    buildType(subProj_bt_298_4)
    buildType(subProj_bt_298_5)
})
