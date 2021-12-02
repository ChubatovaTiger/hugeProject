package subProj_1850

import subProj_1850.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1850")
    name = "subProj 1850"

    buildType(subProj_bt_1850_5)
    buildType(subProj_bt_1850_4)
    buildType(subProj_bt_1850_1)
    buildType(subProj_bt_1850_0)
    buildType(subProj_bt_1850_3)
    buildType(subProj_bt_1850_2)
})
