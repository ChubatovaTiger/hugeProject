package subProj_944

import subProj_944.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_944")
    name = "subProj 944"

    buildType(subProj_bt_944_3)
    buildType(subProj_bt_944_4)
    buildType(subProj_bt_944_5)
    buildType(subProj_bt_944_0)
    buildType(subProj_bt_944_1)
    buildType(subProj_bt_944_2)
})
