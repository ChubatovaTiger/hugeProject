package subProj_419

import subProj_419.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_419")
    name = "subProj 419"

    buildType(subProj_bt_419_0)
    buildType(subProj_bt_419_1)
    buildType(subProj_bt_419_2)
    buildType(subProj_bt_419_3)
    buildType(subProj_bt_419_4)
    buildType(subProj_bt_419_5)
})
