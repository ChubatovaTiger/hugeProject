package subProj_1335

import subProj_1335.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1335")
    name = "subProj 1335"

    buildType(subProj_bt_1335_4)
    buildType(subProj_bt_1335_5)
    buildType(subProj_bt_1335_2)
    buildType(subProj_bt_1335_3)
    buildType(subProj_bt_1335_0)
    buildType(subProj_bt_1335_1)
})
