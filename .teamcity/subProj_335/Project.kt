package subProj_335

import subProj_335.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_335")
    name = "subProj 335"

    buildType(subProj_bt_335_2)
    buildType(subProj_bt_335_1)
    buildType(subProj_bt_335_0)
    buildType(subProj_bt_335_5)
    buildType(subProj_bt_335_4)
    buildType(subProj_bt_335_3)
})
