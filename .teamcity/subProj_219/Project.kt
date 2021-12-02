package subProj_219

import subProj_219.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_219")
    name = "subProj 219"

    buildType(subProj_bt_219_0)
    buildType(subProj_bt_219_1)
    buildType(subProj_bt_219_2)
    buildType(subProj_bt_219_3)
    buildType(subProj_bt_219_4)
    buildType(subProj_bt_219_5)
})
