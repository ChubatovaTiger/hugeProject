package subProj_386

import subProj_386.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_386")
    name = "subProj 386"

    buildType(subProj_bt_386_4)
    buildType(subProj_bt_386_3)
    buildType(subProj_bt_386_5)
    buildType(subProj_bt_386_0)
    buildType(subProj_bt_386_2)
    buildType(subProj_bt_386_1)
})
