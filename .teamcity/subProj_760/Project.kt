package subProj_760

import subProj_760.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_760")
    name = "subProj 760"

    buildType(subProj_bt_760_0)
    buildType(subProj_bt_760_2)
    buildType(subProj_bt_760_1)
    buildType(subProj_bt_760_4)
    buildType(subProj_bt_760_3)
    buildType(subProj_bt_760_5)
})
