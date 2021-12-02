package subProj_244

import subProj_244.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_244")
    name = "subProj 244"

    buildType(subProj_bt_244_4)
    buildType(subProj_bt_244_5)
    buildType(subProj_bt_244_2)
    buildType(subProj_bt_244_3)
    buildType(subProj_bt_244_0)
    buildType(subProj_bt_244_1)
})
