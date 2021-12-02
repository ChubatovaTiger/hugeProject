package subProj_1389

import subProj_1389.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1389")
    name = "subProj 1389"

    buildType(subProj_bt_1389_0)
    buildType(subProj_bt_1389_1)
    buildType(subProj_bt_1389_2)
    buildType(subProj_bt_1389_3)
    buildType(subProj_bt_1389_4)
    buildType(subProj_bt_1389_5)
})
