package subProj_1873

import subProj_1873.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1873")
    name = "subProj 1873"

    buildType(subProj_bt_1873_5)
    buildType(subProj_bt_1873_3)
    buildType(subProj_bt_1873_4)
    buildType(subProj_bt_1873_1)
    buildType(subProj_bt_1873_2)
    buildType(subProj_bt_1873_0)
})
