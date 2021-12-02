package subProj_1760

import subProj_1760.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1760")
    name = "subProj 1760"

    buildType(subProj_bt_1760_0)
    buildType(subProj_bt_1760_1)
    buildType(subProj_bt_1760_2)
    buildType(subProj_bt_1760_3)
    buildType(subProj_bt_1760_4)
    buildType(subProj_bt_1760_5)
})
