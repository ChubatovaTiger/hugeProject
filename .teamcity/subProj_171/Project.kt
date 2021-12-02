package subProj_171

import subProj_171.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_171")
    name = "subProj 171"

    buildType(subProj_bt_171_2)
    buildType(subProj_bt_171_1)
    buildType(subProj_bt_171_4)
    buildType(subProj_bt_171_3)
    buildType(subProj_bt_171_5)
    buildType(subProj_bt_171_0)
})
