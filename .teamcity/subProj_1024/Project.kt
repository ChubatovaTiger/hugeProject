package subProj_1024

import subProj_1024.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1024")
    name = "subProj 1024"

    buildType(subProj_bt_1024_4)
    buildType(subProj_bt_1024_3)
    buildType(subProj_bt_1024_2)
    buildType(subProj_bt_1024_1)
    buildType(subProj_bt_1024_5)
    buildType(subProj_bt_1024_0)
})
