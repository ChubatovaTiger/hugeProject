package subProj_184

import subProj_184.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_184")
    name = "subProj 184"

    buildType(subProj_bt_184_0)
    buildType(subProj_bt_184_2)
    buildType(subProj_bt_184_1)
    buildType(subProj_bt_184_4)
    buildType(subProj_bt_184_3)
    buildType(subProj_bt_184_5)
})
