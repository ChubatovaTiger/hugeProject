package subProj_241

import subProj_241.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_241")
    name = "subProj 241"

    buildType(subProj_bt_241_5)
    buildType(subProj_bt_241_2)
    buildType(subProj_bt_241_1)
    buildType(subProj_bt_241_4)
    buildType(subProj_bt_241_3)
    buildType(subProj_bt_241_0)
})
