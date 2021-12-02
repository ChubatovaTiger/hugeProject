package subProj_30

import subProj_30.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_30")
    name = "subProj 30"

    buildType(subProj_bt_30_0)
    buildType(subProj_bt_30_1)
    buildType(subProj_bt_30_2)
    buildType(subProj_bt_30_3)
    buildType(subProj_bt_30_4)
    buildType(subProj_bt_30_5)
})
