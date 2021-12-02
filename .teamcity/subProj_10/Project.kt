package subProj_10

import subProj_10.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_10")
    name = "subProj 10"

    buildType(subProj_bt_10_5)
    buildType(subProj_bt_10_4)
    buildType(subProj_bt_10_3)
    buildType(subProj_bt_10_2)
    buildType(subProj_bt_10_1)
    buildType(subProj_bt_10_0)
})
