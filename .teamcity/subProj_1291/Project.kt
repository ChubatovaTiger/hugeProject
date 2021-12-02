package subProj_1291

import subProj_1291.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1291")
    name = "subProj 1291"

    buildType(subProj_bt_1291_0)
    buildType(subProj_bt_1291_4)
    buildType(subProj_bt_1291_3)
    buildType(subProj_bt_1291_2)
    buildType(subProj_bt_1291_1)
    buildType(subProj_bt_1291_5)
})
