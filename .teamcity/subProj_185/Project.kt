package subProj_185

import subProj_185.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_185")
    name = "subProj 185"

    buildType(subProj_bt_185_1)
    buildType(subProj_bt_185_0)
    buildType(subProj_bt_185_3)
    buildType(subProj_bt_185_2)
    buildType(subProj_bt_185_5)
    buildType(subProj_bt_185_4)
})
