package subProj_437

import subProj_437.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_437")
    name = "subProj 437"

    buildType(subProj_bt_437_1)
    buildType(subProj_bt_437_0)
    buildType(subProj_bt_437_3)
    buildType(subProj_bt_437_2)
    buildType(subProj_bt_437_5)
    buildType(subProj_bt_437_4)
})
