package subProj_819

import subProj_819.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_819")
    name = "subProj 819"

    buildType(subProj_bt_819_1)
    buildType(subProj_bt_819_0)
    buildType(subProj_bt_819_3)
    buildType(subProj_bt_819_2)
    buildType(subProj_bt_819_5)
    buildType(subProj_bt_819_4)
})
