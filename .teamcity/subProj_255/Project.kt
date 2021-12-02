package subProj_255

import subProj_255.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_255")
    name = "subProj 255"

    buildType(subProj_bt_255_4)
    buildType(subProj_bt_255_5)
    buildType(subProj_bt_255_2)
    buildType(subProj_bt_255_3)
    buildType(subProj_bt_255_0)
    buildType(subProj_bt_255_1)
})
