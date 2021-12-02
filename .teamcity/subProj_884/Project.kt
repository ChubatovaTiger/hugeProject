package subProj_884

import subProj_884.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_884")
    name = "subProj 884"

    buildType(subProj_bt_884_4)
    buildType(subProj_bt_884_5)
    buildType(subProj_bt_884_0)
    buildType(subProj_bt_884_1)
    buildType(subProj_bt_884_2)
    buildType(subProj_bt_884_3)
})
