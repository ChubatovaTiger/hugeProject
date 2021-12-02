package subProj_330

import subProj_330.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_330")
    name = "subProj 330"

    buildType(subProj_bt_330_5)
    buildType(subProj_bt_330_4)
    buildType(subProj_bt_330_3)
    buildType(subProj_bt_330_2)
    buildType(subProj_bt_330_1)
    buildType(subProj_bt_330_0)
})
