package subProj_623

import subProj_623.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_623")
    name = "subProj 623"

    buildType(subProj_bt_623_5)
    buildType(subProj_bt_623_2)
    buildType(subProj_bt_623_1)
    buildType(subProj_bt_623_4)
    buildType(subProj_bt_623_3)
    buildType(subProj_bt_623_0)
})
