package subProj_873

import subProj_873.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_873")
    name = "subProj 873"

    buildType(subProj_bt_873_3)
    buildType(subProj_bt_873_2)
    buildType(subProj_bt_873_1)
    buildType(subProj_bt_873_0)
    buildType(subProj_bt_873_5)
    buildType(subProj_bt_873_4)
})
