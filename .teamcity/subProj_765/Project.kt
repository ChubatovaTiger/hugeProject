package subProj_765

import subProj_765.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_765")
    name = "subProj 765"

    buildType(subProj_bt_765_3)
    buildType(subProj_bt_765_2)
    buildType(subProj_bt_765_5)
    buildType(subProj_bt_765_4)
    buildType(subProj_bt_765_1)
    buildType(subProj_bt_765_0)
})
