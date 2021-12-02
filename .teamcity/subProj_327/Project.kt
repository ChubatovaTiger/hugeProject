package subProj_327

import subProj_327.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_327")
    name = "subProj 327"

    buildType(subProj_bt_327_3)
    buildType(subProj_bt_327_2)
    buildType(subProj_bt_327_1)
    buildType(subProj_bt_327_0)
    buildType(subProj_bt_327_5)
    buildType(subProj_bt_327_4)
})
