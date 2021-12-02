package subProj_573

import subProj_573.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_573")
    name = "subProj 573"

    buildType(subProj_bt_573_4)
    buildType(subProj_bt_573_3)
    buildType(subProj_bt_573_5)
    buildType(subProj_bt_573_0)
    buildType(subProj_bt_573_2)
    buildType(subProj_bt_573_1)
})
