package subProj_459

import subProj_459.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_459")
    name = "subProj 459"

    buildType(subProj_bt_459_2)
    buildType(subProj_bt_459_3)
    buildType(subProj_bt_459_0)
    buildType(subProj_bt_459_1)
    buildType(subProj_bt_459_4)
    buildType(subProj_bt_459_5)
})
