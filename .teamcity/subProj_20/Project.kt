package subProj_20

import subProj_20.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_20")
    name = "subProj 20"

    buildType(subProj_bt_20_0)
    buildType(subProj_bt_20_1)
    buildType(subProj_bt_20_2)
    buildType(subProj_bt_20_3)
    buildType(subProj_bt_20_4)
    buildType(subProj_bt_20_5)
})
