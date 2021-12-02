package subProj_477

import subProj_477.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_477")
    name = "subProj 477"

    buildType(subProj_bt_477_3)
    buildType(subProj_bt_477_2)
    buildType(subProj_bt_477_1)
    buildType(subProj_bt_477_0)
    buildType(subProj_bt_477_5)
    buildType(subProj_bt_477_4)
})
