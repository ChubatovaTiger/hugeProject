package subProj_389

import subProj_389.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_389")
    name = "subProj 389"

    buildType(subProj_bt_389_4)
    buildType(subProj_bt_389_5)
    buildType(subProj_bt_389_2)
    buildType(subProj_bt_389_3)
    buildType(subProj_bt_389_0)
    buildType(subProj_bt_389_1)
})
