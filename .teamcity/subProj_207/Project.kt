package subProj_207

import subProj_207.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_207")
    name = "subProj 207"

    buildType(subProj_bt_207_0)
    buildType(subProj_bt_207_1)
    buildType(subProj_bt_207_2)
    buildType(subProj_bt_207_3)
    buildType(subProj_bt_207_4)
    buildType(subProj_bt_207_5)
})
