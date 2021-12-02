package subProj_841

import subProj_841.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_841")
    name = "subProj 841"

    buildType(subProj_bt_841_1)
    buildType(subProj_bt_841_2)
    buildType(subProj_bt_841_0)
    buildType(subProj_bt_841_5)
    buildType(subProj_bt_841_3)
    buildType(subProj_bt_841_4)
})
