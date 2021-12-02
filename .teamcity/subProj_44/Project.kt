package subProj_44

import subProj_44.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_44")
    name = "subProj 44"

    buildType(subProj_bt_44_1)
    buildType(subProj_bt_44_0)
    buildType(subProj_bt_44_3)
    buildType(subProj_bt_44_2)
    buildType(subProj_bt_44_5)
    buildType(subProj_bt_44_4)
})
