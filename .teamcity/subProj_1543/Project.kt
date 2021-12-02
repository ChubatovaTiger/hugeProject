package subProj_1543

import subProj_1543.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1543")
    name = "subProj 1543"

    buildType(subProj_bt_1543_2)
    buildType(subProj_bt_1543_1)
    buildType(subProj_bt_1543_0)
    buildType(subProj_bt_1543_5)
    buildType(subProj_bt_1543_4)
    buildType(subProj_bt_1543_3)
})
