package subProj_209

import subProj_209.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_209")
    name = "subProj 209"

    buildType(subProj_bt_209_0)
    buildType(subProj_bt_209_5)
    buildType(subProj_bt_209_1)
    buildType(subProj_bt_209_2)
    buildType(subProj_bt_209_3)
    buildType(subProj_bt_209_4)
})
